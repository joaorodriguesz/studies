//@Component
//@Selector
//@auseState("param")

//====== CLASS DECORATOR

//Factory
function Logger(prefix: string){
  return (target) => {
    //console.log(`${prefix} - ${target}`);
  }
}

@Logger('auew')
class Foo {

}


function setApiVersion(setApiVersion: string){
  return (target) => {
    return class extends target {
      version = setApiVersion;
    }
  }
}

@setApiVersion("1.0.0")
class Api {

}

//console.log(new Api);

//====== Property decorator

function minLength (length2: number){
  return (target: any,key: string) => {
    let val = target[key];

    const getter = () => val;

    const setter = (value: string) =>{
      if(value.length < length2){
        console.log('pequeno de mais');
      } else {
        val = value;
      }
    }

    //este metodo defini os getter e os setters
    //toda vem que chamar para exibbir movie.title ele vai passar pelo get e se for inserir pelo set
    Object.defineProperty(target, key, {get: getter, set: setter});
  }
}


class Movie {
  @minLength(3)
  title: string;

  constructor (t: string){
    this.title = t;
  }

}

//const teste = new Movie('aAaaaa');

//============ Method decorator

function delay (ms: number) {
  return (target: any, key: string, descriptor: PropertyDescriptor) => {
    const originalMetodo = descriptor.value;
    
    descriptor.value = function (...args){
      console.log("esperando...");
      setTimeout(() => {
        originalMetodo.apply(this, args);
      }, ms);

      return descriptor;
    }
  }
}

class Greeter  {
  greeting: string;

  constructor(g: string){
    this.greeting = g;
  }

  @delay(1000)
  greet() {
    console.log('AAA'+this.greeting);
  }
}

const teste = new Greeter("Pessoinha");
teste.greet();


 


//Parameter decorator
//Acessor decorator





