package main

import (
	"fmt"
	//"strings"
)

func main() {
	var A,B int
	fmt.Scan(&A,&B)
	var anc int = euclid(A,B)
	fmt.Println(anc)
}

func euclid(A,B int) int{
	if A%B == 0{
		return B
	}
	return euclid(B,A%B)
}
