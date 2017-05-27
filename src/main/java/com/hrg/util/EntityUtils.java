package com.hrg.util;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class EntityUtils {

    /**
     * 将 空字符串 转 null
     * @param object
     * @return
     */
    public static Object setNull(Object object){
        Class<? extends Object> clazz = object.getClass();
        Field[] fields = object.getClass().getDeclaredFields();
        try {
            for (int j = 0; j < fields.length; j++) {
                Field field = fields[j];
                field.setAccessible(true);
                PropertyDescriptor pd = null;
                try {
                    pd = new PropertyDescriptor(field.getName(),clazz);
                } catch (IntrospectionException e) {
                    continue;
                }
                if (pd.getReadMethod() != null) {
                    Method getMethod = pd.getReadMethod();
                    Object o = getMethod.invoke(object);
                    if(ValidUtil.isNullOrEmpty(o)||ValidUtil.isNullOrEmpty(o.toString())){
                        field.set(object,null);
                    }
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return object;
    }


    /**
     * Object转Map
     * @param bean
     * @return
     * @throws IntrospectionException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public static Map<String,Object> convertBean(Object bean)
            throws IntrospectionException, IllegalAccessException, InvocationTargetException {
        Class type = bean.getClass();
        Map returnMap = new HashMap();
        BeanInfo beanInfo = Introspector.getBeanInfo(type);
        PropertyDescriptor[] propertyDescriptors =  beanInfo.getPropertyDescriptors();
        for (int i = 0; i< propertyDescriptors.length; i++) {
            PropertyDescriptor descriptor = propertyDescriptors[i];
            String propertyName = descriptor.getName();
            if (!propertyName.equals("class")) {
                Method readMethod = descriptor.getReadMethod();
                Object result = readMethod.invoke(bean, new Object[0]);
                if (result != null) {
                    returnMap.put(propertyName, result);
                } else {
                    returnMap.put(propertyName, "");
                }
            }
        }
        return returnMap;
    }

    /**
     * 字段比较
     * @param mapOld    改之前
     * @param mapNew    改后
     * @param fieldMap  对比的字段中文名称
     * @return
     */
    public static String compare(Map<String,Object> mapOld, Map<String,Object> mapNew, Map<String,String> fieldMap){
        StringBuffer sb = new StringBuffer();
        for(Map.Entry<String,String> entry:fieldMap.entrySet()){
            Object oldVal = mapOld.get(entry.getKey());
            Object newVal = mapNew.get(entry.getKey());
            if(!oldVal.equals(newVal)){
                sb.append("修改").append(entry.getValue()).append("为").append(newVal).append(",");
            }
        }
        String str = sb.toString();
        if(str.length()>0){
            str = str.substring(0,str.length()-1);
        }
        return str;
    }
}  
