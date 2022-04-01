package main

import (
        "fmt"
        //"strings"
)

func main() {
        var A int
        fmt.Scan(&A)
		list := make([]int,A+1)
		list[0] = 0
		list[1] = 1
        for i := 2;i < A+1;i++ { 
			list[i] = list[i-1] + list[i-2]
        }
        fmt.Println(list[A])
}
