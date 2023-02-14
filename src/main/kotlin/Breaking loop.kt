fun main() {
//    for (i in 1..20) {
//        print(" $i ")
//    }

    a@ for (i in 1..5) {
       b@  for (j in 1..10) {
           if (i==2)break@b
            print("${i*j}\t")
        }
        print('\n')
    }
}