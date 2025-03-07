package com.monglife.core.utils;

import java.lang.reflect.Field;

public class ReflectionUtil {

    /**
     * 필드 값 조회
     * @param obj 객체
     * @param fieldName 필드명
     * @return 필드 값
     */
    public static Object getField(Object obj, String fieldName) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                boolean isAccessible = field.canAccess(obj);
                field.setAccessible(true);

                try {
                    return field.get(obj);
                } catch (IllegalAccessException ignored) {
                } finally {
                    field.setAccessible(isAccessible);
                }
            }
        }

        return null;
    }

    /**
     * 필드 값 변경
     * @param obj 객체
     * @param fieldName 필드명
     * @param value 필드 값
     * @return 변경된 객체
     */
    public static Object setField(Object obj, String fieldName, Object value) {
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.getName().equals(fieldName)) {
                boolean isAccessible = field.canAccess(obj);
                field.setAccessible(true);

                try {
                    field.set(obj, value);
                } catch (IllegalAccessException ignored) {
                } finally {
                    field.setAccessible(isAccessible);
                }
            }
        }

        return obj;
    }

    /**
     * 필드 값 복사
     * @param obj 원본 객체
     * @param targetObj 타겟 객체
     * @return 타겟 객체
     */
    public static Object setFields(Object obj, Object targetObj) {
        Field[] targetFields = targetObj.getClass().getDeclaredFields();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field targetField : targetFields) {
            for (Field field : fields) {

                String targetFieldName = targetField.getName();
                String fieldName = field.getName();

                if (targetFieldName.equals(fieldName)) {
                    boolean isFieldAccessible = field.canAccess(obj);
                    boolean isTargetFieldAccessible = targetField.canAccess(targetObj);
                    field.setAccessible(true);
                    targetField.setAccessible(true);

                    try {
                        Object fieldValue = field.get(obj);
                        targetField.set(targetObj, fieldValue);
                    } catch (IllegalAccessException ignored) {
                    } finally {
                        field.setAccessible(isFieldAccessible);
                        targetField.setAccessible(isTargetFieldAccessible);
                    }

                    break;
                }
            }
        }

        return targetObj;
    }
}
