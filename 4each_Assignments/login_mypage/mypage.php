<?php
mb_internal_encoding("utf8");
session_start();

if(empty($_SESSION['id'])){

try{
$pdo = new PDO("mysql:dbname=lesson01;host=localhost;","root","mysql");
}catch(PDOException $e){
die("<p>申し訳ございません。現在サーバーが混み合っており一時的にアクセスが出来ません。<br>しばらくしてから再度ログインをしてください。</p><a href='http://localhost/login_mypage/login.php'>ログイン画面へ</a>"
 );
}

//プリペアードステートメント
$stmt = $pdo->prepare("select * from login_mypage where mail = ? && password = ?");
//bindvalueメソッドでパラメータをセット
$stmt->bindValue(1,$_POST['mail']);
$stmt->bindValue(2,$_POST['password']);

//executeでクエリを実行
$stmt->execute();
//fetch while文でデータを取得し、sessionに代入
    
        while($row=$stmt->fetch()){
            $_SESSION['id']=$row['id'];
            $_SESSION['name']=$row['name'];
            $_SESSION['mail']=$row['mail'];
            $_SESSION['password']=$row['password'];
            $_SESSION['picture']=$row['picture'];
            $_SESSION['comments']=$row['comments'];
        }
//データ取得が出来ずに(emptyを使用して判定) sessionがなければリダイレクト(エラー画面へ)
        if(empty($_SESSION['id']))
        {
            header("Location:login_error.php");
        }

setcookie('mail',$_POST['mail'],time()+60*60*24*7);
setcookie('password',$_POST['password'],time()+60*60*24*7);
}
$pdo = NULL;

?>

<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>マイページ登録</title>
        <link rel="stylesheet" type="text/css" href="mypage.css">
    </head>
    
　<body>
    <header>
        <img src="4eachblog_logo.jpg">
        <div class="logout"><a href="log_out.php">ログアウト</a></div>
    </header>
    
    <main>
        <form action="mypage_hensyu.php" method="post" class="form_center">
            <div class="box">
             <h2>会員情報</h2>

            <div class="hello">
                <?php echo "こんにちは! ".$_SESSION['name']."さん"; ?>
            </div>

            <div class="profile_pic">
                <img src="<?php echo $_SESSION['picture'];?>">
            </div>

            <div class="basic_info">
                <p>氏名 :<?php echo $_SESSION['name']; ?></p>
                <p>メール :<?php echo $_SESSION['mail']; ?></p>
                <p>パスワード :<?php echo $_SESSION['password']; ?></p>
            </div>

            <div class="comments">
                <?php echo $_SESSION['comments']; ?>
            </div>


                <input type="hidden" value="<?php echo rand(1,10);?>" name="from_mypage">
                    <div class="hensyubutton">
                        <input type= "submit" class="submit_button" size="35" value = "編集する">
                    </div>
            </div>  
        </form>    
    </main>  
    <footer>
        © 2018 InterNous.inc. All rights reserved
    </footer>
  </body>
</html>