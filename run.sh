#!/bin/sh
rm -rf target
javac Main.java
mkdir target
mkdir target/Modelos
mkdir target/Retos
cd Modelos
mv *.class ../target/Modelos/
cd ..
cd Retos
mv *.class ../target/Retos/
cd ..
mv *.class target
cd target
java Main