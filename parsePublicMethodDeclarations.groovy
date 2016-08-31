import java.io.*;
import java.io.File

publicMethodNameArray = "public BAPQueryBuilder buildQueryString(HttpServletRequest request,HttpSession session,SalesOrderBrowserBean bean,SalesOrderBrowserSelectionBean selectionBean) throws ServletException, IOException {"

index = publicMethodNameArray.indexOf("(");

publicMethodTitle = new char[index];
publicMethodArguments = new char[publicMethodNameArray.length() - index];

publicMethodNameArray.getChars(0,index, publicMethodTitle, 0);
publicMethodNameArray.getChars(index + 1, publicMethodNameArray.indexOf(")"), publicMethodArguments, 0);

String[] titleArray = new String[publicMethodTitle.count(" ") + 1];
argumentsArray = new String[publicMethodArguments.count(" ") + 1];

def int count = 0;

for( i in 0..(publicMethodTitle.count(" ") - 1)) {

    titleArray[i] = publicMethodTitle.toString().substring(0, publicMethodTitle.toString().indexOf(' '));
    publicMethodTitle = publicMethodTitle.toString().substring(publicMethodTitle.toString().indexOf(' ')).trim();
    count = i;
}

count++;

titleArray[count] = publicMethodTitle;

println();
for( j in 0..(count)) {
    println "Qualifier #" + (j + 1)  + ":   " + titleArray[j];
}

count = 0;

for( i in 0..(publicMethodArguments.count(",") - 1)) {

    argumentsArray[i] = publicMethodArguments.toString().substring(0, publicMethodArguments.toString().indexOf(','));
    publicMethodArguments = publicMethodArguments.toString().substring(publicMethodArguments.toString().indexOf(',') + 1);
    count = i;
}

count++;

argumentsArray[count] = publicMethodArguments;

println();
for( j in 0..(count)) {
    println "Argument #" + (j + 1)  + ":    " + argumentsArray[j];
}