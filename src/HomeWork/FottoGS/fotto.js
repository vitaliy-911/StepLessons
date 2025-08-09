document.addEventListener('DOMContentLoaded', () => {
    const loadPhotosBtn = document.getElementById("loadPhotosBtn");
    const clearPhotosBtn = document.getElementById("clearPhotosBtn");
    const url = 'https://jsonplaceholder.typicode.com/photos';
    const gallery = document.getElementById('gallery');
    const output = document.getElementById('output');

    

    loadPhotosBtn.addEventListener('click', () => {
        getFotto();

    })

    async function getFotto() {
        const response = await fetch(url + '?_limit=10');
        try {
            if (!response.ok) throw new Error('Ошибка');
            const photo = await response.json();
        
            for (const el of photo) {
                const card = document.createElement('div');
                card.className="photo-card";

                const img =new Image();
                img.src= el.thumbnailUrl;

                const title = document.createElement('p');
                title.textContent =el.title;
                
                card.appendChild(img);
                card.appendChild(title);
                gallery.appendChild(card);

                
                
            }
           
            
        }
        catch (error) {
            output.textContent = 'Ошибка сети';
        };

    };


    clearPhotosBtn.addEventListener('click',()=>{
        gallery.innerHTML ='';
        output.textContent='';
    })

    gallery.addEventListener('click',()=>{
        gallery.url=url;
    })

   



});
