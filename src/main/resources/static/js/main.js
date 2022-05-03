function ApiObject() {
    this.failedResponseHandler = function (response) {
        console.error('Failed response.');
        console.log(response);
    };

    this.successfulResponseHandler = function (response) {
        console.log('Successfully load response.');
        console.log(response);
       let funImg = document.querySelector(".fun");

        if (response.direction) {
            funImg.style.animationName = 'spin-direct';
        } else {
            funImg.style.animationName = 'spin-forward';
        }

        switch (response.speed){
            case 1: {
                funImg.classList.add("one");
                funImg.style.animationDuration = `3s`;
                funImg.style.animationPlayState = `running`;
                break;
            }
            case 2: {
                funImg.classList.add("two");
                funImg.style.animationDuration = `2s`;
                funImg.style.animationPlayState = `running`;
                break;
            }
            case 3: {
                funImg.classList.add("third");
                funImg.style.animationPlayState = `running`;
                funImg.style.animationDuration = `1s`;
                break;
            }
            case 0:
            default: {
                funImg.classList.add("zero");
                funImg.style.animationPlayState = `paused`;
            }
        }
    };

    this.doAjaxPost = function (url, onSuccess = this.successfulResponseHandler, onError = this.failedResponseHandler) {
        console.log("Do ajax post method");
        $.post({
            url: url,
            contentType: 'application/json',
            success: onSuccess,
            error: onError
        });
    };
}

$(document).ready(function () {
    g_api = new ApiObject();
    this.Cord1_click = function () {
        g_api.doAjaxPost("/cord1");
    }

    this.Cord2_click = function () {
        g_api.doAjaxPost("/cord2");
    }

    $("#btCord1").click(this.Cord1_click);
    $("#btCord2").click(this.Cord2_click);
});