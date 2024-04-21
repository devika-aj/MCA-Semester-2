#!/bin/bash
while true;
do
echo "Enter a number to find month(1-12) :"
read n
case $n in
1)
echo "Month is January"
;;
2)
echo "Month is February"
;;
3)
echo "Month is March"
;;
4)
echo "Month is April"
;;
5)
echo "Month is May"
;;
6)
echo "Month is June"
;;
7)
echo "Month is July"
;;
8)
echo "Month is August"
;;
9)
echo "Month is September"
;;
10)
echo "Month is October"
;;
11)
echo "Month is November"
;;
12)
echo "Month is December"
;;
0)
exit
;;
*)
echo "invalid input"
esac
done
