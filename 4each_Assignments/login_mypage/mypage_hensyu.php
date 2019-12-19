<?php
mb_internal_encoding("utf8");

session_start();

//mypage.phpからの導線以外は　login_error.phpへリダイレクト
if(empty($_POST['from_mypage'])){
    header("Location:login_error.php");
}
?>

<!DOCTYPE html>
<html lang="ja">

    <head>
        <meta charset="UTF-8">
        <title>マイページ登録</title>
        <link rel="stylesheet" type="text/css" href="mypage_hensyu.css">
    </head>
    
    <body>
    <header>
        <img src="4eachblog_logo.jpg">
        <div class="logout"><a href="log_out.php">ログアウト</a></div>
    </header>
    
    <main>
        <form action="mypage_update.php" method="post" class="form_center">
            <div class="box">
                <h2>会員情報</h2>

            <div class="hello">
                <?php echo "こんにちは! ".$_SESSION['name']."さん"; ?>
            </div>

            <div class="profile_pic">
                <img src="<?php echo $_SESSION['picture'];?>">
            </div>

            <div class="basic_info">
                <p>氏名 :<input type="text" class="formbox" size="30" name="nameChanged" value="<?php echo $_SESSION['name'];?>">
                </p>
               
                <p>メール :<input type="text" class="formbox" size="30" name="mailChanged" pattern="^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" value="<?php echo $_SESSION['mail'];?>">
                </p>
                
                <p>パスワード :<input type="password" class="formbox" size="30" name="passwordChanged" id="password" pattern="^[a-zA-Z0-9]{6,}$" value="<?php echo $_SESSION['password'];?>">
                </p>
            </div>

            <div class="comments">
                <textarea rows="5" cols="85" name="commentsChanged" value="<?php echo $_SESSION['comments'];?>"></textarea>
            </div>

            <input type="hidden" value="<?php echo rand(1,10);?>" name="form_mypage">
                <div class="hensyubutton">
                    <input type= "submit" class="submit_button" size="35" value = "この内容に編集する">
                </div>
            </div>
        </form>
    </main>
    
    <footer>
        © 2018 InterNous.inc. All rights reserved
    </footer>
    
    </body>
</html>