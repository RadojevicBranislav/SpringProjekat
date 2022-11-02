$(document).ready(function() {
    works(); //has to be changed in generateCards();
});



function works(){

    fetch('http://localhost:8080/artists')//link has to be changed
    .then((response) =>{ response.json();
    })
    .then((myJson) => console.log(json));

}
function generateCards()
{

    fetch('http://10.20.1.52:8080/artists')//link has to be changed
    .then((response) =>{ response.json();
    })
    .then((myJson) => {
        var innerHtml = "";
        var table = document.getElementById("cards");

        $.each(myJson, function(index, artist){
            
            innerHtml+=`
            <div class="card col col-sm-12 col-md-6 col-lg-4">
            <div class="card-body">
                <h5 class="card-title">${artist.id} type: ${artist.type}</h5>
                <h5 class="card-title">${artist.fistName}</h5>
                <h6 class="card-subtitle mb-2 text-muted">${artists.lastName}</h6>
            </div>
            </div>
            `

        })

        table.innerHTML = innerHtml;
    });

}
