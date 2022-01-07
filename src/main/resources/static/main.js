var Fila = null
function onSubmit() {
    let DataForm = Leer()
    if (Fila == null){
        InsertarDatos(DataForm)
    } else{
        Actualizar(DataForm)
        Vaciar()
    }
}
function Leer() {
    let DataForm = {}
    DataForm["nom"] = document.getElementById("nom").value
    DataForm["ape"] = document.getElementById("ape").value
    DataForm["pais"] = document.getElementById("pais").value
    DataForm["ed"] = document.getElementById("ed").value
    DataForm["dire"] = document.getElementById("dire").value
    DataForm["est"] = document.getElementById("est").value
    DataForm["promo"] = document.getElementById("promo").value
    return DataForm
}
function InsertarDatos(data) {
    let table = document.getElementById("tabla").getElementsByTagName('tbody')[0]
    let Fila = table.insertRow(table.length)
    columna1 = Fila.insertCell(0).innerHTML = data.nom
    columna2 = Fila.insertCell(1).innerHTML = data.ape
    columna3 = Fila.insertCell(2).innerHTML = data.pais
    columna4 = Fila.insertCell(3).innerHTML = data.ed
    columna5 = Fila.insertCell(4).innerHTML = data.dire
    columna6 = Fila.insertCell(5).innerHTML = data.est
    columna7 = Fila.insertCell(6).innerHTML = data.promo
    columna8 = Fila.insertCell(7).innerHTML = `<input class="submit" type="button" onClick="Editarr(this)" value="Editar" >
                                            <input class="submit" type="button" onClick="Borrarr(this)" value="Borrar" >`
    document.getElementById("nom").focus()
    Vaciar()
}
function Vaciar() {
    document.getElementById("nom").value = ""
    document.getElementById("ape").value = ""
    document.getElementById("pais").value = ""
    document.getElementById("ed").value = ""
    document.getElementById("dire").value = ""
    document.getElementById("est").value = ""
    document.getElementById("promo").value = ""
    Fila = null
}
function Editarr(td) {
    Fila = td.parentElement.parentElement
    document.getElementById("nom").value = Fila.cells[0].innerHTML
    document.getElementById("ape").value = Fila.cells[1].innerHTML
    document.getElementById("pais").value = Fila.cells[2].innerHTML
    document.getElementById("ed").value = Fila.cells[3].innerHTML
    document.getElementById("dire").value = Fila.cells[4].innerHTML
    document.getElementById("est").value = Fila.cells[5].innerHTML
    document.getElementById("promo").value = Fila.cells[6].innerHTML
}
function Actualizar(DataForm) {
    Fila.cells[0].innerHTML = DataForm.nom
    Fila.cells[1].innerHTML = DataForm.ape
    Fila.cells[2].innerHTML = DataForm.pais
    Fila.cells[3].innerHTML = DataForm.ed
    Fila.cells[4].innerHTML = DataForm.dire
    Fila.cells[5].innerHTML = DataForm.est
    Fila.cells[6].innerHTML = DataForm.promo
    document.getElementById("nom").focus()
}
function Borrarr(td) {
    if (confirm('¿Seguro de borrar este registro?')) {
        row = td.parentElement.parentElement
        document.getElementById("tabla").deleteRow(row.rowIndex)
        Vaciar()
    }
}
