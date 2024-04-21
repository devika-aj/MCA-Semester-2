echo "Enter first number:"
read num1
echo "Enter second number:"
read num2
echo "Enter third number;"
read num3
if(((num1>num2)&&(num1>num3)));then
    echo "$num1 is largest"
elif(((num2>num1)&&(num2>num3)));then
    echo "$num2 is largest"
else
    echo "$num3 is largest"
fi