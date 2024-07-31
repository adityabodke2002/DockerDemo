#!/bin/bash

# This is a comment
echo "Hello, World!"

# Define a variable
NAME="John Doe"

# Print the variable
echo "My name is $NAME"

# Basic arithmetic
NUMBER1=5
NUMBER2=10
SUM=$((NUMBER1 + NUMBER2))
echo "The sum of $NUMBER1 and $NUMBER2 is $SUM"

# Loop example
for i in {1..5}
do
  echo "Looping ... number $i"
done

# Conditional example
if [ $NUMBER1 -lt $NUMBER2 ]
then
  echo "$NUMBER1 is less than $NUMBER2"
else
  echo "$NUMBER1 is not less than $NUMBER2"
fi

