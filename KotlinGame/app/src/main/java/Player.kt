class Player(val name: String, var level: Int = 1,
             var lives: Int = 3, var score: Int = 0) {

    var weapon: Weapon = Weapon("Fist", 1);

    private val inventory = ArrayList<Loot>()

    fun show(){
        if(lives > 0){
            println("$name is alive")
        }else{
            println("$name is dead")
        }
    }

    fun getLoot(item: Loot){
        inventory.add(item)
        //ToDo code to save inventory to disk
    }

    fun dropLoot(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        }else{
            false
        }
    }

    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        for (items in inventory)
        {
            if(items.name == name){
                inventory.remove(items)
                return true
            }
        }
        println("No Such thing")
        return false
    }

    override fun toString(): String{
        return("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: $weapon
        """)
    }

    fun showInventory(){
        println("$name's inventory")
        var total = 0.0
        for(item in inventory){
            println(item)
            total += item.value
        }
        println("*************")
        println("Total score is: $total")
    }
}