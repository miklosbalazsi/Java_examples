## Lombok examples

https://projectlombok.org/  
https://www.baeldung.com/intro-to-project-lombok  
https://objectcomputing.com/resources/publications/sett/january-2010-reducing-boilerplate-code-with-project-lombok  


What is Lombok 
---
"Boilerplate" is a term used to describe code that is repeated in many parts of an application with little alteration. 
One of the most frequently voiced criticisms of the Java language is the volume of this type of code that is found in most projects. 
This problem is frequently a result of design decisions in various libraries, but is exacerbated by limitations in the language itself. 
Project Lombok aims to reduce the prevalence of some of the worst offenders by replacing them with a simple set of annotations.


The way it works is by plugging into your build process and autogenerating Java bytecode into your .class files as per a 
number of project annotations you introduce in your code.

LOMBOK ANNOTATIONS
---

####@GETTER AND @SETTER
The @Getter and @Setter annotations generate a getter and setter for a field, respectively. 
The getters generated correctly follow convention for boolean properties, resulting in an isFoo getter method name instead 
of getFoo for any boolean field foo.


####@NONNULL
The @NonNull annotation is used to indicate the need for a fast-fail null check on the corresponding member. 
When placed on a field for which Lombok is generating a setter method, 
a null check will be generated that will result in a NullPointerException should a null value be provided.

####@TOSTRING
This annotation generates an implementation of the toString method. 