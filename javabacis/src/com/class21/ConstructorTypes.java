package com.class21;

public class ConstructorTypes {
//  ConstructorTypes(){
//  System.out.println("I am a constructor with no parameters");
//}

ConstructorTypes(String str){//str - is a local variable to a constructor
    System.out.println("I am a constructor with 1 parameter "+str);
}

ConstructorTypes(int a, String str){
    System.out.println("I am a constructor with 2 parameters "+a+" and "+str);
}

public static void main(String[] args) {
    
    ConstructorTypes obj1=new ConstructorTypes("String1");
    
    ConstructorTypes obj2=new ConstructorTypes("String");
    
    ConstructorTypes obj3=new ConstructorTypes(123, "String");
    
}
}
// CONSTRUCTOR VS METHOD;
/*
 * CONSTRUCTOR MUST BE THE SAME NAME AS THE CLASS, WHEREAS METHOD CAN HAVE ANY NAME
 * CONSTRUCTOR CANNOT HAVE A RETURN TYPE NOT EVEN VOID , WHEREAS METHOD MUST HAVE A RETURN TYPE
 * CONSTRUCTOR CANNOT BE STATIC , WHEREAS METHODS CAN BE STATIC OR NON STATIC
 * CONSTRUCTOR IS GETTING CALLES AUTOMATICALLY, WHEREAS METHODS NEEDS TO BE CALLED
 * IF WE DO NOT DEFINE A CONSTRUCTOR, COMPILER WILL CREATE 1 DEFAULT FOR YOU, WHEREAS FOR METHODS COMPILER WONT CREATE IT
 * SIMILARITY :
 * 1. BOTH CONSTRUCTORS AND METHODS HAVE MIGHT NOT HAVE PARAMETERS
 * 2. ACCESS MODIFIERS CAN BE USED
 *
 */

