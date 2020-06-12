package com.onion.day.utils.datastructortest;

import java.lang.reflect.Type;

/**
 * @author 蔡光前
 * @version v1.0.0
 * @Title:
 * @Package
 * @Description: (用一句话描述该文件做什么)
 * @date 2020/6/12 11:29
 **/
public class EnumTest {
    public static void main(String[] args) {
        forEnum();
        useEnumInJava();
    }

    private static void useEnumInJava() {
        String typeName="f5";
        TYPE type=TYPE.fromTypeName(typeName);
        if(TYPE.BALANCE.equals(type)){
            System.out.println("根据字符串获得的枚举类型实例跟枚举常量一致");
        }else {
            System.out.println("代码有错");
        }
    }

    private static void forEnum(){
        /**
         * 循环枚举,输出ordinal属性；若枚举有内部属性，则也输出。(说的就是我定义的TYPE类型的枚举的typeName属性)
         */
        for(SimpleEnum simpleEnum: SimpleEnum.values()){
            System.out.println(simpleEnum+"ordinal"+simpleEnum.ordinal());
        }
        System.out.println("---------");
        for (TYPE type : TYPE.values()) {
            System.out.println("type = " + type + "    type.name = " + type.name() + "   typeName = " + type.getTypeName() + "   ordinal = " + type.ordinal());
        }

    }
    private enum SimpleEnum{
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER;
    }
    private enum TYPE{
        FIREWALL("firewall"),
        SECRET("secretMac"),
        BALANCE("f5");

        private String typeName;

        TYPE(String typeName) {
            this.typeName = typeName;
        }
        /**
         * 根据类型的名称，返回类型的枚举实例。
         *
         * @param typeName 类型名称
         */
        public static TYPE fromTypeName(String typeName) {
            for (TYPE type : TYPE.values()) {
                if (type.getTypeName().equals(typeName)) {
                    return type;
                }
            }
            return null;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }
}
