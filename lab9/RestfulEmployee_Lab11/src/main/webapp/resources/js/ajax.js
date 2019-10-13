function makeAjaxCall() {

    let data = JSON.stringify(serializeObject($("#employeeForm")));
    $.ajax({
        type: "POST",
        url: "addEmp",
        data: data,
        contentType: "application/json",
        dataType: "json",

        success: function (result) {
            console.log(result);
            $('#formInput').html("");
            $("#formInput").append('<H3 align="center"> New Employee Information <H3>');
            $('#formInput').append("<H4 align='center'>First Name:  " + result.firstName + "</h4>");
            $('#formInput').append("<H4 align='center'>Last Name: " + result.lastName + "</h4>");
            $('#formInput').append("<H4 align='center'>Email: " + result.email + "</h4>");
            $("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');reset_form(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
            show_form('formInput');
            hide_form('errors');
        },

        error: function (XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest.responseJSON);
            $("#errors").empty();

            if (XMLHttpRequest.responseJSON.errorType == "ValidationError") {
                let errorMsg = '<h3> Error(s)!! </h3>';
                errorMsg += "<p>";
                var errorList = XMLHttpRequest.responseJSON.errors;
                errorList.forEach(error => {
                    errorMsg = errorMsg + error.field + " " + error.message + '<br>';
                })

                errorMsg += '</p>';
                $('#errors').append(errorMsg);
                show_form('errors');
                hide_form('formInput');
            } else {
                alert(errorObject.responseJSON.errors(0)); // "non" Validation
            }
        }
    });
}

toggle_visibility = function (id) {
    var element = document.getElementById(id);
    if (element.style.display == 'block')
        element.style.display = 'none';
    else
        element.style.display = 'block';
}

hide_form = function (id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
}

show_form = function (id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
}

reset_form = function (id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

}

function serializeObject(form) {
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function () {
        jsonObject[this.name] = this.value;
    });
    return jsonObject;

};

