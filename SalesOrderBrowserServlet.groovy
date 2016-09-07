import java.io.File

def array = new File('C:/SFP Projects/2016/Reliable Parts/reliable2-log_mode/reliable2/tustore/src/com/ibsus/rp3/ns','SalesOrderBrowserServlet.java') as String[]

def x = 0
arrayIndexBreakpoint = 100;
arrayIndexStartPoint = 1;

for ( j in 1 .. 8) {
    println j
    for ( i in (j*arrayIndexBreakpoint - 1)..((j-1)*arrayIndexBreakpoint)) {
        //println array[i] + " "
        print array[i].length() + ","
        x -= i
    }
    println()
}

print "9"
println()

for ( i in 845..800) {
    //println array[i] + " "
    print array[i].length() + ","
    x -= i
}

println()
println()

arrayIndexBreakPoint = 0
arrayIndexStartPoint = array.size() - 1

for ( i in arrayIndexStartPoint..0) {
    //println array[i] + " "
    print array[i].length() + ","
    x -= i
}
