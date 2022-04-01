package main

import (
	"fmt"
	//"strings"
)

func main() {
	var A int
	fmt.Scan(&A)
	var anc int = Fibonacci(A)
	fmt.Println(anc)
}

func Fibonacci(A int) int{
	if A == 0{
		return 0
	}else if A == 1{
		return 1
	}
	
	return Fibonacci(A-1) + Fibonacci(A-2)
}
