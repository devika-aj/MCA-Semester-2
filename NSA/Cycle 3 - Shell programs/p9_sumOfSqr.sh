function find_sum(){
sum=$((num1+num2))
echo "Sum is: $sum"
}
function find_diff(){
diff=$((num1-num2))
echo "Difference is:$diff"
}
function find_product(){
prod=$((num1*num2))
echo "Product is:$prod"
}
function find_quotient(){
quotient=$((num1/num2))
echo "Quotient is:$quotient"
}
echo -e "Menu\n1.Sum\n2.Difference\n3.Product\n4.Quotient"
echo "Enter your choice:"
read choice
echo "Enter two numbers :"
read num1
read num2
case $choice in
1)
find_sum;;
2)
find_diff;;
3)
find_product;;
4)
find_quotient;;
esac
