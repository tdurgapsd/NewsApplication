fetch("/news")
    .then(res => res.json())
    .then(data => {

        let container = document.getElementById("newsContainer");

        data.results.forEach(n => {
            let div = document.createElement("div");

            div.innerHTML = `
          <h3>${n.title}</h3>
          <img src="${n.image_url}" width="200"/>
          <p>${n.description}</p>
          <a href="${n.link}" target="_blank">Read more</a>
          <hr>
        `;

            container.appendChild(div);
        });

    });
