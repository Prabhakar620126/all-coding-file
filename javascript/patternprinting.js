function hollowsquarepattern(n) {
  for (var i = 0; i < n; i++) {
    if (i == 0 || i == n - 1) {
      var str = "";
      for (var j = 0; j < n; j++) {
        str = str + "*";
      }
      console.log(str);
    } else {
      var st = "";
      for (var j = 0; j < n; j++) {
        if (j == 0 || j == n - 1) {
          st = st + "*";
        } else {
          st = st + " ";
        }
      }
      console.log(st);
    }
  }
}
console.log("hollw rectangle");
hollowsquarepattern(5);
function righttrianglepattern(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i - 1; j++) {
      str = str + " ";
    }

    for (var j = 0; j < i + 1; j++) {
      str = str + "*";
    }
    console.log(str);
  }
}
console.log("right triangle pattern");
righttrianglepattern(5);

function lefttrianglepattern(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i; j++) {
      str = str + "*";
    }
    console.log(str);
  }
}
console.log("left triangle  pattern");
lefttrianglepattern(5);
function downwardtriangle(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i; j++) {
      str = str + "*";
    }
    console.log(str);
  }
}
console.log("downward triangle pattern");
downwardtriangle(5);

function hollowtriangle(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    if (i == 0 || i == n - 1) {
      for (var j = 0; j < i + 1; j++) {
        str = str + "*";
      }
    } else {
      for (var j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          str = str + "*";
        } else {
          str = str + " ";
        }
      }
    }
    console.log(str);
  }
}
console.log("hollw triangle ");
hollowtriangle(5);

function pyramidpattern(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i - 1; j++) {
      str = str + " ";
    }
    for (var j = 0; j < 2 * i + 1; j++) {
      str = str + "*";
    }
    console.log(str);
  }
}
console.log("pyramid triangle ");
pyramidpattern(5);

function reversepyramid(n) {
  for (var i = n; i > 0; i--) {
    var str = "";
    for (var j = 0; j < n - i; j++) {
      str = str + " ";
    }
    for (var j = 0; j < 2 * i - 1; j++) {
      str = str + "*";
    }
    console.log(str);
  }
}
console.log(" reverse pyramid ");
reversepyramid(5);

function hollowpyramidpattern(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i + 1; j++) {
      str = str + " ";
    }
    if (i == 0 || i == n - 1) {
      for (var j = 0; j < 2 * i + 1; j++) {
        str = str + "*";
      }
    } else {
      for (var j = 0; j < 2 * i + 1; j++) {
        if (j == 0 || j == 2 * i) {
          str = str + "*";
        } else {
          str = str + " ";
        }
      }
    }

    console.log(str);
  }
}
console.log(" hollow pyramid ");
hollowpyramidpattern(5);

function diamondpattern(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i - 1; j++) {
      str = str + " ";
    }
    for (var j = 0; j < 2 * i + 1; j++) {
      str = str + "*";
    }

    console.log(str);
  }
  for (var i = n; i > 0; i--) {
    var str = "";
    for (var j = 0; j < n - i + 1; j++) {
      str = str + " ";
    }
    for (var j = 2; j < 2 * i - 1; j++) {
      str = str + "*";
    }

    console.log(str);
  }
}
console.log(" diamond pattern ");
diamondpattern(5);
function hollodiamond(n) {
  for (var i = 0; i < n; i++) {
    var str = "";
    for (var j = 0; j < n - i-1; j++) {
      str = str + " ";
    }
    if (i == 0) {
      for (var j = 0; j < 2 * i + 1; j++) {
        str = str + "*";
        //str= str+"*";
      }
    } else {
      for (var j = 0; j < 2 * i + 1; j++) {
        if (j == 0 || j == 2 * i) {
          str = str + "*";
        } else {
          str = str + " ";
        }
      }
    }

    console.log(str);
  }
  for (var i = n-1; i > 0; i--) {
    var str = "";
    for (var j = 0; j < n - i; j++) {
      str = str + " ";
    }
    if (i == 0) {
      //str = str + "*";
    } else {
      for (var j = 0; j < 2 * i+2; j++) {
        if (j == 0 || j == 2 * i-1) {
          str = str + "*";
        } else {
          str = str + " ";
        }
      }
    }
    console.log(str);
  }
}
console.log("hollow diamond ");
hollodiamond(5);
