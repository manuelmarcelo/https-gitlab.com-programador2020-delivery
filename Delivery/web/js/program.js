class Restaurant {
    static pedir() {
        //Conexion con el servlet
        fetch("MenuRestaurant")       
        .then(data => console.log(data));
    }

}


Restaurant.pedir();