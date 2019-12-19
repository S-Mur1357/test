document.write("★の出力");
document.write("<br>");
document.write("<br>");

document.write("問１");
document.write("<br>");

for(var i = 0; i < 5; i++){
    document.write("★");
}
document.write("<br>");
document.write("<br>");

document.write("問2");
document.write("<br>");
for(var i = 0; i < 2; i++)
{
    for(var j = 0; j < 3; j++)
    {
        document.write("★");
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問3");
document.write("<br>");
for(var i =0; i < 2; i++)
{
    for(var j = 0; j < 5; j++)
    {
        document.write("☆");
    }
    
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");

document.write("問4");
document.write("<br>");
for(var i =0; i < 4; i++)
{
    for(var j = 0; j < 5; j++)
    {
        document.write("★");
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問5");
document.write("<br>");
for(var i =0; i < 4; i++)
{
    for(var j = 0; j < 3; j++)
    {
        document.write("★");
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問6");
document.write("<br>");
for(var i =0; i < 3; i++)
{
    for(var j = 0; j < 3; j++)
    {   
        if(j % 2 == 0)
        {
            document.write("★");
        }else
        {
            document.write("☆");
        }
        
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問7");
document.write("<br>");
for(var i =0; i < 4; i++)
{
    for(var j = 0; j < 5; j++)
    {   
        if(j % 2 == 0)
        {
            document.write("★");
        }else
        {
            document.write("☆");
        }
        
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問8");
document.write("<br>");
for(var i = 1; i < 6; i++)
{
    for(var j = 0; j < i; j++)
    {
        document.write("★");
    }
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");


document.write("★の出力上級");
document.write("<br>");
document.write("<br>");

document.write("問1");
document.write("<br>");
for(var i =0; i < 5; i++)
{
    if(i % 2 == 0){
        for(var j = 0; j < 5; j++)
        {   

            if(j % 2 == 0)
            {
                document.write("★");
            }else
            {
                document.write("☆");
            }
        }
    }else{
         for(var j = 0; j < 5; j++)
        {   

            if(j % 2 == 0)
            {
                document.write("☆");
                
            }else
            {
                document.write("★");
            }
        }
    }
    
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");

document.write("問2");
document.write("<br>");
for(var i =　0; i < 5; i++)
{
        for(var j = 0; j < 5; j++)
        {   
            if(i == j)
            {
                document.write("☆");            
            }else
            {
                document.write("★")
            }
        }
    document.write("<br>");
}
document.write("<br>");
document.write("問3");
document.write("<br>");
for(var i = 1; i < 6; i++)
{
    for(var j = 0; j < i; j++)
    {   
        if((i - j) == 1)
        {
            document.write("☆");
        }
        else
        {
            document.write("★");
        }
        
    }
    document.write("<br>");
}
document.write("<br>");
document.write("<br>");


document.write("関数");
document.write("<br>");
document.write("<br>");
document.write("問1");
document.write("<br>");
document.write("半径5ｃｍの円の面積は");
document.write("<br>");
function circleArea(radius,pi = 3.14){
    return radius * radius * pi;
}
document.write(circleArea(5) + "平方センチメートルです。");
document.write("<br>");
document.write("<br>");
document.write("半径7ｃｍの円の面積は");
document.write("<br>");
document.write(circleArea(7) + "平方センチメートルです。");
document.write("<br>");
document.write("<br>");
document.write("半径10ｃｍの円の面積は");
document.write("<br>");
document.write(circleArea(10) + "平方センチメートルです。");
document.write("<br>");
document.write("<br>");
document.write("問２");
document.write("<br>");
function totalPrice(adultNumber, childNumber){
    return adultNumber * 500 + childNumber * 200;
}
document.write("Aグループの合計金額は" + totalPrice(2,4) + "円です。");
document.write("<br>");
document.write("Bグループの合計金額は" + totalPrice(1,5) + "円です。");
document.write("<br>");
document.write("Cグループの合計金額は" + totalPrice(3,7) + "円です。");
document.write("<br>");


