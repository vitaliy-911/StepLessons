document.addEventListener('DOMContentLoaded',()=>{
    const ajax =document.getElementById('AJAX');
    const ajax2 =document.getElementById('AJAX2');
    const ajax3 = document.getElementById('AJAX3');
    const ajax4 = document.getElementById('AJAX4');

    const url = 'https://jsonplaceholder.typicode.com/posts/1';
    const url2 = 'https://jsonplaceholder.typicode.com/posts';



    ajax.addEventListener('click',()=>{
        const xhr = new XMLHttpRequest();//это мы создаем обьект из строки
        xhr.open('GET',url , true);
        xhr.onreadystatechange = function(){
            if(xhr.readyState === 4 && xhr.status === 200){
               const post = JSON.parse(xhr.responseText);
               console.log(post);
              
               const p = document.createElement('p');//добавляем "p"
               p.textContent = post.title;
               document.body.appendChild(p);
            }
        };
        xhr.send();
    });

    ajax2.addEventListener('click',()=>{//тоже самое
        fetch(url).then(response=>{
            if(!response.ok) throw new Error('Ошибка сети');
            return response.json();
        }).then(data=> console.log(data))
        .catch(error=>console.error(error));
        
    });
//______________________________________________________________________
ajax3.addEventListener('click',()=>{//тоже самое но при помощи функции
    getPOST();
})

async function getPOST() {//функция
    try{
       const response = await fetch(url);
       if(!response.ok) throw new Error('Ошибка сети');
       const date = await response.json();
       console.log(date);
    }
    catch(error){
        console.error(error);
    }
    
}

ajax4.addEventListener('click',()=>{
    getPOSTPOST();

})

async function getPOSTPOST() {
    try{
          const response =  await fetch(url2, {
            method: 'POST',
            headers: {'Content-Type': 'application/json'},
            body: JSON.stringify({
                title:'Новый пост',
                body: 'Содержимое',
                userId : 1})
                  });
          if(!response.ok) throw new Error('Ошибка сети');
          const data =  await response.json();
          console.log(data);
        }
        catch (error){
            console.error(error);
        }
    }
    

});