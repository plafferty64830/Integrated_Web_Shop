
function displayDescription1() {
    var x = document.getElementById("product-description1")
    var y = document.getElementById("Threedots-description1")
        if (x.style.display === 'none') {
            x.style.display = 'inline-block';
            y.style.display = 'none';
           } else {
            x.style.display = 'none';
            y.style.display = 'inline-block';
          }
}

function displayDescription2() {
    var x = document.getElementById("product-description2")
    var y = document.getElementById("Threedots-description2")
            if (x.style.display === 'none') {
                x.style.display = 'inline-block';
                y.style.display = 'none';
            } else {
                x.style.display = 'none';
                y.style.display = 'inline-block';
            }
}

function displayDescription3() {
     var x = document.getElementById("product-description3")
     var y = document.getElementById("Threedots-description3")
        if (x.style.display === 'none') {
            x.style.display = 'inline-block';
            y.style.display = 'none';
        } else {
            x.style.display = 'none';
            y.style.display = 'inline-block';
        }
}

function changeImgSize1() {
    var x = document.getElementById("product-img1")
    if (x.style.width === '150px') {
        x.style.width = '600px';
        x.style.height = '400px';
    } else {
        x.style.width = '150px';
        x.style.height = '150px';
    }
}

function changeImgSize2() {
    var x = document.getElementById("product-img2")
    if (x.style.width === '150px') {
        x.style.width = '600px';
        x.style.height = '400px';
    } else {
        x.style.width = '150px';
        x.style.height = '150px';
    }
}

function changeImgSize3() {
    var x = document.getElementById("product-img3")
    if (x.style.width === '150px') {
        x.style.width = '600px';
        x.style.height = '400px';
    } else {
        x.style.width = '150px';
        x.style.height = '150px';
    }
}

