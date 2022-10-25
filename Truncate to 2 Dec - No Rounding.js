
var str = valuein;
try {
    str = str.toString().split('.');
    var res = str[1].slice(0, 2);
    valueout = str[0] + '.' + res;
} catch (err) {
    valueout = valuein;

}