Ajax

1. Asynchronous =>비동기적인

2. JavaScript => 자바스크립트를 이용

3. XML 

   =>xml형태로 자료가 오갔기 때문. 현재는 xml뿐만 아니라 json, text등 다양한 자료형태로 오감

4. fake_insta에서, jquery cdn 바꿔주고, 콘솔에 와서, 

   ```javascript
   var scriptJ = document.createElement('script');
   scriptJ.src = "https://code.jquery.com/jquery-3.3.1.min.js";
   document.head.appendChild(scriptJ);
   <script src=​"https:​/​/​code.jquery.com/​jquery-3.3.1.min.js">​</script>​
   $
   ƒ (e,t){return new w.fn.init(e,t)}
   $.ajax
   ƒ (t,n){"object"==typeof t&&(n=t,t=void 0),n=n||{};var i,o,a,s,u,l,c,f,p,d,h=w.ajaxSetup({},n),g=h.context||h,y=h.context&&(g.nodeType||g.jquery)?w(g):w.event,v=w.Deferred(),m=w.Callbacks("once memory"…
   $.ajax({url:'/posts/39/comments',type:'POST',data:{content:"1"} });
   {readyState: 1, getResponseHeader: ƒ, getAllResponseHeaders: ƒ, setRequestHeader: ƒ, overrideMimeType: ƒ, …}
           
           
    //오류남
    jquery.self-bd7ddd393353a8d2480a622e80342adf488fb6006d667e8b42e4c0073393abee.js?body=1:10255 POST http://localhost:3000/posts/39/comments 404 (Not Found)
   send @ jquery.self-bd7ddd393353a8d2480a622e80342adf488fb6006d667e8b42e4c0073393abee.js?body=1:10255
   ajax @ jquery.self-bd7ddd393353a8d2480a622e80342adf488fb6006d667e8b42e4c0073393abee.js?body=1:9739
   (anonymous) @ VM286:1
   var csrf_token=$('[name="csrf-token"]').attr('content')
   undefined
   csrf_token
   "5uJ+gxcHusGFMGOriVcC6iWZpqKl/hJpRq8TXUJ/pUWC29opZUZQBrU+LDb2cPJLgp0A9PIkv7CwPZsMI3Y/Mw=="
    //댓글다는 곳 들어가서,
    $.ajax({url:'/posts/39/comments',type:'POST',data:{content:"1",authenticity_token:csrf_token} });
   {readyState: 1, getResponseHeader: ƒ, getAllResponseHeaders: ƒ, setRequestHeader: ƒ, overrideMimeType: ƒ, …}
   ```

   

   

   

   

   

   

   