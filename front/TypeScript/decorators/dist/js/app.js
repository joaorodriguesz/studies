//@Component
//@Selector
//@auseState("param")
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
//====== CLASS DECORATOR
//Factory
function Logger(prefix) {
    return (target) => {
        //console.log(`${prefix} - ${target}`);
    };
}
let Foo = class Foo {
};
Foo = __decorate([
    Logger('auew')
], Foo);
function setApiVersion(setApiVersion) {
    return (target) => {
        return class extends target {
            constructor() {
                super(...arguments);
                this.version = setApiVersion;
            }
        };
    };
}
let Api = class Api {
};
Api = __decorate([
    setApiVersion("1.0.0")
], Api);
//console.log(new Api);
//====== Property decorator
function minLength(length2) {
    return (target, key) => {
        let val = target[key];
        const getter = () => val;
        const setter = (value) => {
            if (value.length < length2) {
                console.log('pequeno de mais');
            }
            else {
                val = value;
            }
        };
        //este metodo defini os getter e os setters
        //toda vem que chamar para exibbir movie.title ele vai passar pelo get e se for inserir pelo set
        Object.defineProperty(target, key, { get: getter, set: setter });
    };
}
class Movie {
    constructor(t) {
        this.title = t;
    }
}
__decorate([
    minLength(3)
], Movie.prototype, "title", void 0);
//const teste = new Movie('aAaaaa');
//============ Method decorator
function delay(ms) {
    return (target, key, descriptor) => {
        const originalMetodo = descriptor.value;
        descriptor.value = function (...args) {
            console.log("esperando...");
            setTimeout(() => {
                originalMetodo.apply(this, args);
            }, ms);
            return descriptor;
        };
    };
}
class Greeter {
    constructor(g) {
        this.greeting = g;
    }
    greet() {
        console.log('AAA' + this.greeting);
    }
}
__decorate([
    delay(1000)
], Greeter.prototype, "greet", null);
const teste = new Greeter("Pessoinha");
teste.greet();
//Parameter decorator
//Acessor decorator
