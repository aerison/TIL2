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

asdf