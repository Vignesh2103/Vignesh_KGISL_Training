var countries = ["India", "France", "uk", "usa", "Africa", "Russia", "Japan", "China"];
console.log("------------THE ARRAY-----------");
display();
function display() {
    countries.forEach(i => {
        console.log(i)
    });

}
function add(item) {

    countries.push(item);
    console.log("---------------ADD---------------");
    console.log("country "+item+" was added");
    console.log(countries.join(" "));

}
function remove(start, end) {

    countries.splice(start, end);
    console.log("--------------SPLICE---------------");
    console.log("Country from "+start+" to "+end+" was Removed");
    console.log(countries.join(" "));
}
function FindandReplace(remove, add) {
    var ind = countries.indexOf(remove);
    countries.splice(ind, 1);
    countries.splice(ind, 0, add);
    console.log("-------------------Replace--------------------");
    console.log(remove+" country replaced by "+add);
    console.log(countries.join(" "));

}

add("Italy");
remove(1, 3);
FindandReplace("China","German");

console.log(countries.join(" "));