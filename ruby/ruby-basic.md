Ruby

### 0.개요

atom?

////////////////////////////////////////////////////////

1.깃배쉬설치
2.
student@M14031 MINGW64 ~
$ pwd
/c/Users/student

student@M14031 MINGW64 ~
$ mkdir TIL

student@M14031 MINGW64 ~
$ cd TIL

student@M14031 MINGW64 ~/TIL
$



타이포라에 작성한것 til폴더에 저장
깃배쉬에서 ls치면 제목.md나옴

c9에 가서 뉴워크스페이스 

1. 루비는 순수객체 지향언어이다

2. 모든것이 객체

3. Ruby on Rails 프레임워크등장으로 유명해짐

4. #주석처리

5. 2칸 띄어쓰기 추천

6. puts<-println

   ## 1.puts vs print

   irb쳐서 시작

   1. 3.times {print "hello" } #hellohellohello

   2. 3.times {puts "hello"} #hello

      ​					#hello

      ​					#hello>

      

      ### 2.puts vs p

      i

      2.4.0 :002 > array=[1,2,3]

       => [1, 2, 3] 
      2.4.0 :003 > puts array
      1
      2
      3
       => nil 
      2.4.0 :004 > p array
      [1, 2, 3]
       => [1, 2, 3] 
      2.4.0 :005 > a="hello"
       => "hello" 
      2.4.0 :006 > puts a
      hello
       => nil 
      2.4.0 :007 > p a
      "hello"
       => "hello" 
      2.4.0 :008 > 

   3. Naming conventions

      - 변수:snake_case

      - 상수:CONSTANT

      - CLASS:CamelCase

        2.4.0 :006 > puts a
        hello
         => nil 
        2.4.0 :007 > p a
        "hello"
         => "hello" 
        2.4.0 :008 > exit;
        2.4.0 :009 >   exit
        july0325:~/workspace $ gem install pry

        5.pry

        ```
        
        ```

        `gem install pry`   

        

        ```july0325:~/workspace $ pry
        
        ```

        [1] pry(main)> puts "hello"
        hello
        => nil
        [2] pry(main)> class Integer
        [2] pry(main)*   def doller
        [2] pry(main)*     self*1100
        [2] pry(main)*   end  
        [2] pry(main)* end  
        => :doller
        [3] pry(main)> 5.doller
        => 5500
        [4] pry(main)> ```

        

        6.inline Statement

        #if문

        #while문

        

        조건문은 오른쪽에 사용된다

        [4] pry(main)> a=0
        => 0
        [5] pry(main)> b=1
        => 1
        [6] pry(main)> puts "a=0" if a==0
        a=0출력됨
        => nil
        [7] pry(main)> puts "a=0" if a==1
        => nil 출력안됨
        [8] pry(main)> 

        [9] pry(main)> c+=2 while c>50
        => nil
        [10] pry(main)> result=c+=2 while c<50                                                                                
        => nil
        [11] pry(main)> puts result
        50
        => nil
        [12] pry(main)> 

      - false /nil을 제외한 모든 문은 true

        [12] pry(main)> puts "hey" if 0
        hey
        => nil

        #0은 true

        

      - ===(true)

      - case 문

      - ```ruby
        [13] pry(main)> name="me"
        
        => "me"
        
        [14] pry(main)> case name
        
        [14] pry(main)* when "me" then puts "hey me"  
        
        [14] pry(main)* when "take" then puts "hey little me"                                                                
        
        [14] pry(main)* else puts "hey"  
        
        [14] pry(main)* end  
        
        hey me
        
        => nil
        
        ```

      - 

        [13] pry(main)> name="me"
        => "me"
        [14] pry(main)> case name
        [14] pry(main)* when "me" then puts "hey me"  
        [14] pry(main)* when "take" then puts "hey little me"                                                                
        [14] pry(main)* else puts "hey"  
        [14] pry(main)* end  
        hey me
        => nil

      - method

			 	asd

dfg

- asd

- asd

- .현재폴더 ..상위폴더

  ```ruby
  #깃배쉬임
  student@M14031 MINGW64 ~/TIL
  $ ls
  ruby/
  
  student@M14031 MINGW64 ~/TIL
  $ cd .ruby
  bash: cd: .ruby: No such file or directory
  
  student@M14031 MINGW64 ~/TIL
  $ ls
  ruby/
  
  student@M14031 MINGW64 ~/TIL
  $ cd /ruby
  bash: cd: /ruby: No such file or directory
  
  student@M14031 MINGW64 ~/TIL
  $ ls
  ruby/
  
  student@M14031 MINGW64 ~/TIL
  $ cd ruby/
  
  student@M14031 MINGW64 ~/TIL/ruby
  $ ls
  Rubybasic.md
  
  student@M14031 MINGW64 ~/TIL/ruby
  $ ls -a
  ./  ../  Rubybasic.md
  
  student@M14031 MINGW64 ~/TIL/ruby
  $ git init
  Initialized empty Git repository in C:/Users/student/TIL/ruby/.git/
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ ls -a
  ./  ../  .git/  Rubybasic.md
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git add .
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  
  On branch master
  
  No commits yet
  
  Changes to be committed:
    (use "git rm --cached <file>..." to unstage)
  
          new file:   Rubybasic.md
  
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git commit
  
  *** Please tell me who you are.
  
  Run
  
    git config --global user.email "you@example.com"
    git config --global user.name "Your Name"
  
  to set your account's default identity.
  Omit --global to set the identity only in this repository.
  
  fatal: unable to auto-detect email address (got 'student@M14031.(none)')
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git commit -m "ruby flow of control"
  
  *** Please tell me who you are.
  
  Run
  
    git config --global user.email "you@example.com"
    git config --global user.name "Your Name"
  
  to set your account's default identity.
  Omit --global to set the identity only in this repository.
  
  fatal: unable to auto-detect email address (got 'student@M14031.(none)')
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git config --global user.email
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git config --global user.email "sonsoo1224@gmail.com"
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git config --global user.name "aeriSon"
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  $ git commit -m "ruby flow of control"
  [master (root-commit) 3c3ec3d] ruby flow of control
   1 file changed, 1 insertion(+)
   create mode 100644 Rubybasic.md
  
  student@M14031 MINGW64 ~/TIL/ruby (master)
  
  ```

  새창켜서 

```ruby
#깃허브에 뉴 레포지토리 새로운 til만든다
#아래주소 복사붙여넣기
student@M14031 MINGW64 ~/TIL/ruby (master)
$ git remote add origin https://github.com/aerison/TIL2.git

student@M14031 MINGW64 ~/TIL/ruby (master)
$
#다음 push붙여넣ㄱ시
git push -u origin master
student@M14031 MINGW64 ~/TIL/ruby (master)
$ git push -u origin master
Username for 'https://github.com': aerison
error: unable to read askpass response from 'C:/Program Files/Git/mingw64/libexec/git-core/git-gui--askpass'
Password for 'https://aeriSon @github.com':
remote: Invalid username or password.
fatal: Authentication failed for 'https://github.com/aerison/TIL2.git/'

student@M14031 MINGW64 ~/TIL/ruby (master)
$ git push -u origin master
Username for 'https://github.com': aerison
Counting objects: 3, done.
Writing objects: 100% (3/3), 224 bytes | 224.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/aerison/TIL2.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

student@M14031 MINGW64 ~/TIL/ruby (master)
$ ^C
#add commit push계속반복
    
```



이제 다시 method로 돌아가서, c9///코드는 타이포라에 다시 옮겨쓰기!

### 8.method(Shift+tab/tab으로 들여쓰기조절)

- 대부분의 언어
  - 클래스안:function
  - 클래스밖:method
- 루비에서의 모든 function은 메서드

```ruby
july0325:~/workspace $ pry
[1] pry(main)> def simple
[1] pry(main)*   puts "simple"
[1] pry(main)* end  
=> :simple
[2] pry(main)> 

#ruby에서의 메서드는 ()를 써도되고 안써도됨
#return은 선택적사용/return이없을때 마지막 연산값을 리턴합니다

[3] pry(main)> def add(a,b)
[3] pry(main)*   return a+b
[3] pry(main)* end  
=> :add
[4] pry(main)> add 1,2
=> 3
[5] pry(main)> def add2(a,b)
[5] pry(main)*   a+b
[5] pry(main)* end  
=> :add2
[6] pry(main)> add2(1,2)
=> 3
[7] pry(main)> def devide(a,b)
[7] pry(main)*   return "you need to devide !=0" if b==0
[7] pry(main)*   a/b
[7] pry(main)* end  
=> :devide
[8] pry(main)> devide(4,0)
=> "you need to devide !=0"
[9] pry(main)> 
```

- 문제가 생겼길래

  ```ruby
  $ git add .
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git status
  On branch master
  
  No commits yet
  
  Changes to be committed:
    (use "git rm --cached <file>..." to unstage)
  
          new file:   ruby/ruby-basic.md
  
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git commit -m "add ruby-basic.md"
  [master (root-commit) b5a2f6c] add ruby-basic.md
   1 file changed, 403 insertions(+)
   create mode 100644 ruby/ruby-basic.md
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git remote add origin https://github.com/aerison/TIL2.git
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git push -u origin master
  Username for 'https://github.com': aerison
  Counting objects: 4, done.
  Delta compression using up to 4 threads.
  Compressing objects: 100% (2/2), done.
  Writing objects: 100% (4/4), 2.88 KiB | 2.88 MiB/s, done.
  Total 4 (delta 0), reused 0 (delta 0)
  To https://github.com/aerison/TIL2.git
   * [new branch]      master -> master
  Branch 'master' set up to track remote branch 'master' from 'origin'.
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git add .
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git commit -m "
  > "
  Aborting commit due to empty commit message.
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git commit -m "add fix"
  [master b4205e5] add fix
   1 file changed, 1 insertion(+), 1 deletion(-)
  
  student@M14031 MINGW64 ~/TIL (master)
  $ git push
  Username for 'https://github.com': aerison
  Counting objects: 4, done.
  Delta compression using up to 4 threads.
  Compressing objects: 100% (2/2), done.
  Writing objects: 100% (4/4), 312 bytes | 312.00 KiB/s, done.
  Total 4 (delta 1), reused 0 (delta 0)
  remote: Resolving deltas: 100% (1/1), completed with 1 local object.
  To https://github.com/aerison/TIL2.git
     b5a2f6c..b4205e5  master -> master
  
  student@M14031 MINGW64 ~/TIL (master)
  $
  
  #추가되면,
  #저장후, .add >commit>push순
  
     
  ```

- factorial

  ```ruby
  def factorial(n)
  n==0? 1:n*factorial(n-1)
  end
  factorial#매개변수 안적어서error
  #데이터 넣으면 오류안남
  
  
  [11] pry(main)> def factorial_default(n=10)
  [11] pry(main)*   n==0?1:n*factorial_default(n-1)
  [11] pry(main)* end  
  => :factorial_default
  [12] pry(main)> factorial_default
  => 3628800
  [13] pry(main)> 
  ```

- sprit

```ruby
def
```

- block(반복문)

```ruby
#do 로 시작하면 end로 닫는다
[15] pry(main)> 3.times do |asdf|
[15] pry(main)*   puts asdf #블록 부분
[15] pry(main)* end  
0
1
2
=> 3
3.times {puts asdf}
#####
[16] pry(main)> def hihi
[16] pry(main)*   return "no block" unless block_given?#block을 받았니?
[16] pry(main)*   yield #<<문장이 들어갈자리
[16] pry(main)* end  
=> :hihi
[17] pry(main)> hihi
=> "no block"
[18] pry(main)> hihi{puts "hihi"}
=> "no block"

```

- String('',"")

```ruby
july0325:~/workspace $ pry
[1] pry(main)> a="hihi \n it's me"                                                                                     
=> "hihi \n it's me"
[2] pry(main)> b='hihi \n ut's me'
SyntaxError: unexpected tIDENTIFIER, expecting end-of-input
b='hihi \n ut's me'
               ^
[2] pry(main)> puts a
hihi 
 it's me
=> nil
[3] pry(main)> puts b
NameError: undefined local variable or method `b' for main:Object
from (pry):3:in `__pry__'
## ""쓰면 반영 , ''쓰면 글자그대로
[4] pry(main)> name="aeri"
=> "aeri"
[5] pry(main)> "#{name}님 안녕하세요 "
=> "aeri님 안녕하세요 "

[6] pry(main)> my_name="aeri son"
=> "aeri son"
[7] pry(main)> my_name.upcase
=> "AERI SON"#원본데이터는 바뀌지않음!
[8] pry(main)> my_name.upcase!
=> "AERI SON"#원본데이터 자체가 바꿈!

```

- symbol/배열

```ruby
[9] pry(main)> array=[]
=> []
[10] pry(main)> array<<5
=> [5]
[11] pry(main)> array<<10
=> [5, 10]
[12] pry(main)> array<<"string"
=> [5, 10, "string"]
[13] pry(main)> array<<:s
=> [5, 10, "string", :s]
[14] pry(main)> array<<true
=> [5, 10, "string", :s, true]
[15] pry(main)> array[1..2]
=> [10, "string"]
```

아왜 오류나

- case

  ```ruby
  
  ```

  

- hash(key+value)

```ruby
hash={:key=>value}
hash2={ key: value }
hash3={ "key" => value }

[17] pry(main)> array=[]
=> []
[18] pry(main)> hash={}
=> {}
[19] pry(main)> hash.class
=> Hash
[20] pry(main)> array.class
=> Array
[21] pry(main)> hash1={name: "aeri", :age=>27, "hometown"=>"jeju"}
=> {:name=>"aeri", :age=>27, "hometown"=>"jeju"}
[22] pry(main)> hash1["hometown"]
=> "jeju"
[23] pry(main)> hash1[name]
=> nil
[24] pry(main)> hash1["name"]
=> nil
[25] pry(main)> hash1[:name]
=> "aeri"
#||안에 k와 v는 어떠한 것으로 써도됨
[26] pry(main)> hash1.each do|k,v|
[26] pry(main)*   puts "#{k}:#{v}"
[26] pry(main)* end  
name:aeri
age:27
hometown:jeju
=> {:name=>"aeri", :age=>27, "hometown"=>"jeju"}



```

- https://gist.github.com/nacyot/7624036



- Synatra

  ```ruby
  july0325:~/workspace $ mkdir sinatra-test
  july0325:~/workspace $ cd sinatra-test/
  july0325:~/workspace/sinatra-test $ touch app.rb
  july0325:~/workspace/sinatra-test $ gem install sinatra
  Fetching: rack-2.0.5.gem (100%)
  Successfully installed rack-2.0.5
  Fetching: tilt-2.0.8.gem (100%)
  Successfully installed tilt-2.0.8
  Fetching: rack-protection-2.0.2.gem (100%)
  Successfully installed rack-protection-2.0.2
  Fetching: mustermann-1.0.2.gem (100%)
  Successfully installed mustermann-1.0.2
  Fetching: sinatra-2.0.2.gem (100%)
  Successfully installed sinatra-2.0.2
  5 gems installed
  
  ```

  http://sinatrarb.com/intro.html

```ruby
#app.rb에다가, 
#시나트라에 있는것들 넣어주고,

#다시터미널에 들어와,하면 옆에 서버주소 뜸. 클릭하면 서버가열림
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP
[2018-06-07 06:39:37] INFO  WEBrick 1.3.1
[2018-06-07 06:39:37] INFO  ruby 2.4.0 (2016-12-24) [x86_64-linux]
== Sinatra (v2.0.2) has taken the stage on 8080 for development with backup from WEBrick
[2018-06-07 06:39:37] INFO  WEBrick::HTTPServer#start: pid=2324 port=8080
222.107.238.24 - - [07/Jun/2018:06:40:08 +0000] "GET /favicon.ico HTTP/1.1" 404 485 0.0043
10.240.1.191 - - [07/Jun/2018:06:40:08 UTC] "GET /favicon.ico HTTP/1.1" 404 485
https://class0607-july0325.c9users.io/ -> /favicon.ico
222.107.238.24 - - [07/Jun/2018:06:40:09 +0000] "GET / HTTP/1.1" 200 12 0.0007
10.240.0.64 - - [07/Jun/2018:06:40:09 UTC] "GET / HTTP/1.1" 200 12
https://class0607-july0325.c9users.io/ -> /
#만일 다시 서버시작하려면, app.rb수정후에
#서버재시작 
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP
#옆에 url뜸

    
##
july0325:~/workspace/sinatra-test $ mkdir views && touch views/htmlfile.html
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP
하고 app.rb가서,  
    get '/htmlfile' do
    send_file 'views/htmlfile.html'
end
    하고 html파일가서, <ㅗ1>하고싶은말</>
하고, 서버다시키고, 요청하면 나옴!
    
```

https://class0607-july0325.c9users.io/htmlfile

모를땐. ruby string to integer같이 검색

```ruby
#app.rb
require 'sinatra'
require "sinatra/reloader"

get '/' do
  'Hello world! welcome'
end

get '/htmlfile' do
    send_file 'views/htmlfile.html'
end

get '/htmltag' do
    '<h1>html태그를 보낼 수 있습니당</h1>
    <ul>
    <li>1</li>
    <li>11</li>
    </ul>
    '
end

get '/welcome/:name' do
    "#{params[:name]}님안녕하세요"
end

get '/cube/:num' do
    input=params[:num].to_i
    result=input ** 3
    
    "<h1>#{result}</h1>"
    
    "#{params[:num].to_i ** 3}"
end

get '/erbfile' do
    @name ="me"
    erb :erbfile
end

get '/dinner-array' do
    #메뉴들을 배열에 저장한당
    #하나를 추천한다
    #erb파일에 담아서 렌더링한다
    #@를 붙인것들만,뷰파일에서 사용할수 있다!(인스턴스변수)
    menu=["그냥밥","고기","찌개"]
    @menurd=menu.sample
    erb :lunch
end


get '/lunch-hash' do
    #메뉴들이 저장된 배열을 만든다
    #메뉴이름(key) 사진url(value)을 가진 해쉬를 만든다
    #랜덤으로 하나 출력
    #이름과 url을 넘겨서 erb를 렌더링한다
    
    menu=["bab","gogi","soup"]
    menu_Img={
        "bab"=>"http://snacker.hankyung.com/wp-content/uploads/2015/06/%EB%B0%A501.jpg",
        "gogi"=>"data:image/jpeg;base64,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",
        "soup"=>"https://static01.nyt.com/images/2016/11/29/dining/recipelab-chick-noodle-still/recipelab-chick-noodle-still-videoSixteenByNineJumbo1600.jpg"
    }
    @menurandom=menu.sample
    @menu_Img=menu_Img[@menurandom] #key에 접근
    erb :lunchhash
end




```

```ruby
#erb.rb
<h1><%= @name %></h1>
```

```ruby
#터미널
july0325:~/workspace/sinatra-test $ touch views/erbfile.erb
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP
[2018-06-07 07:39:18] INFO  WEBrick 1.3.1
[2018-06-07 07:39:18] INFO  ruby 2.4.0 (2016-12-24) [x86_64-linux]
== Sinatra (v2.0.2) has taken the stage on 8080 for development with backup from WEBrick
[2018-06-07 07:39:18] INFO  WEBrick::HTTPServer#start: pid=3024 port=8080
222.107.238.24 - - [07/Jun/2018:07:39:21 +0000] "GET / HTTP/1.1" 200 20 0.0041
10.240.0.25 - - [07/Jun/2018:07:39:21 UTC] "GET / HTTP/1.1" 200 20
https://ide.c9.io/july0325/class0607 -> /
2018-06-07 07:39:45 - NoMethodError - undefined method `erb' for :erbfile:Symbol:
        app.rb:32:in `block in <main>'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1635:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1635:in `block in compile!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:992:in `block (3 levels) in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1011:in `route_eval'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:992:in `block (2 levels) in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1040:in `block in process_route'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1038:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1038:in `process_route'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:990:in `block in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:989:in `each'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:989:in `route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1097:in `block in dispatch!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `block in invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1094:in `dispatch!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:924:in `block in call!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `block in invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:924:in `call!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:913:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/xss_header.rb:18:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/path_traversal.rb:16:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/json_csrf.rb:26:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/base.rb:50:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/base.rb:50:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/frame_options.rb:31:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/logger.rb:15:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/common_logger.rb:33:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:231:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:224:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/head.rb:12:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/method_override.rb:22:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/show_exceptions.rb:22:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:194:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1958:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1502:in `block in call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1729:in `synchronize'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1502:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/handler/webrick.rb:86:in `service'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/httpserver.rb:140:in `service'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/httpserver.rb:96:in `run'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/server.rb:290:in `block in start_thread'
10.240.1.191 - - [07/Jun/2018:07:39:45 UTC] "GET /erbfile HTTP/1.1" 500 130269
- -> /erbfile
222.107.238.24 - - [07/Jun/2018:07:39:45 +0000] "GET /__sinatra__/500.png HTTP/1.1" 200 24378 0.0021
10.240.1.191 - - [07/Jun/2018:07:39:45 UTC] "GET /__sinatra__/500.png HTTP/1.1" 200 24378
https://class0607-july0325.c9users.io/erbfile -> /__sinatra__/500.png
^C== Sinatra has ended his set (crowd applauds)
[2018-06-07 07:41:44] INFO  going to shutdown ...
[2018-06-07 07:41:44] INFO  WEBrick::HTTPServer#start done.
july0325:~/workspace/sinatra-test $ gem install sinatra-contrib
Fetching: backports-2.8.2.gem (100%)
Successfully installed backports-2.8.2
Fetching: multi_json-1.13.1.gem (100%)
Successfully installed multi_json-1.13.1
Fetching: sinatra-contrib-2.0.2.gem (100%)
Successfully installed sinatra-contrib-2.0.2
3 gems installed
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP                                                                 
[2018-06-07 07:43:47] INFO  WEBrick 1.3.1
[2018-06-07 07:43:47] INFO  ruby 2.4.0 (2016-12-24) [x86_64-linux]
== Sinatra (v2.0.2) has taken the stage on 8080 for development with backup from WEBrick
[2018-06-07 07:43:47] INFO  WEBrick::HTTPServer#start: pid=3075 port=8080
222.107.238.24 - - [07/Jun/2018:07:43:51 +0000] "GET / HTTP/1.1" 200 20 0.0042
10.240.0.25 - - [07/Jun/2018:07:43:51 UTC] "GET / HTTP/1.1" 200 20
https://ide.c9.io/july0325/class0607 -> /
222.107.238.24 - - [07/Jun/2018:07:44:05 +0000] "GET /erbfile HTTP/1.1" 200 11 0.0079
10.240.1.191 - - [07/Jun/2018:07:44:05 UTC] "GET /erbfile HTTP/1.1" 200 11
- -> /erbfile
^C== Sinatra has ended his set (crowd applauds)
[2018-06-07 07:44:40] INFO  going to shutdown ...
[2018-06-07 07:44:40] INFO  WEBrick::HTTPServer#start done.
july0325:~/workspace/sinatra-test $ ruby app.rb -o $IP
[2018-06-07 07:45:07] INFO  WEBrick 1.3.1
[2018-06-07 07:45:07] INFO  ruby 2.4.0 (2016-12-24) [x86_64-linux]
== Sinatra (v2.0.2) has taken the stage on 8080 for development with backup from WEBrick
[2018-06-07 07:45:07] INFO  WEBrick::HTTPServer#start: pid=3549 port=8080
27
222.107.238.24 - - [07/Jun/2018:07:45:59 +0000] "GET /cube/3 HTTP/1.1" 200 11 0.0065
10.240.0.64 - - [07/Jun/2018:07:45:59 UTC] "GET /cube/3 HTTP/1.1" 200 11
- -> /cube/3
2018-06-07 07:46:52 - TypeError - no implicit conversion of Integer into String:
        /home/ubuntu/workspace/sinatra-test/app.rb:28:in `+'
        /home/ubuntu/workspace/sinatra-test/app.rb:28:in `block in <top (required)>'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1635:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1635:in `block in compile!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:992:in `block (3 levels) in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1011:in `route_eval'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:992:in `block (2 levels) in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1040:in `block in process_route'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1038:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1038:in `process_route'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:990:in `block in route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:989:in `each'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:989:in `route!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1097:in `block in dispatch!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `block in invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1094:in `dispatch!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:924:in `block in call!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `block in invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `catch'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1076:in `invoke'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:924:in `call!'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:913:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/xss_header.rb:18:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/path_traversal.rb:16:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/json_csrf.rb:26:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/base.rb:50:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/base.rb:50:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-protection-2.0.2/lib/rack/protection/frame_options.rb:31:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/logger.rb:15:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/common_logger.rb:33:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:231:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:224:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/head.rb:12:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/method_override.rb:22:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/show_exceptions.rb:22:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:194:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1958:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1502:in `block in call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1729:in `synchronize'
        /usr/local/rvm/gems/ruby-2.4.0/gems/sinatra-2.0.2/lib/sinatra/base.rb:1502:in `call'
        /usr/local/rvm/gems/ruby-2.4.0/gems/rack-2.0.5/lib/rack/handler/webrick.rb:86:in `service'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/httpserver.rb:140:in `service'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/httpserver.rb:96:in `run'
        /usr/local/rvm/rubies/ruby-2.4.0/lib/ruby/2.4.0/webrick/server.rb:290:in `block in start_thread'
10.240.1.191 - - [07/Jun/2018:07:46:52 UTC] "GET /cube/5 HTTP/1.1" 500 133415
- -> /cube/5
222.107.238.24 - - [07/Jun/2018:07:46:53 +0000] "GET /__sinatra__/500.png HTTP/1.1" 304 - 0.0021
10.240.1.191 - - [07/Jun/2018:07:46:53 UTC] "GET /__sinatra__/500.png HTTP/1.1" 304 0
https://class0607-july0325.c9users.io/cube/5 -> /__sinatra__/500.png

```

```ruby
#new terminal
july0325:~/workspace $ touch sinatra-test/views/lunch.erb
july0325:~/workspace $ touch sinatra-test/views/lunchhash.erb
```

```ruby
#lunch.erb
<h1>오늘은<%= @menurd %></h1>
#lunchhash.erb
<h1>today menu is <%=@menurandom %></h1>
<img src="<%= @menu_Img%>" height="300" width="300">
```



