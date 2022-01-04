fun main(args: Array<String>) {
    val tim = Player("Tim")

    tim.show()

    val louise = Player("louise", 5)
    louise.show()
    val eoghan = Player("eoghan", 4, 8)
    eoghan.show()

    val erica = Player("erica", 2, 3, 1000)
    erica.show()

    val axe = Weapon("Axe", 12)

    tim.weapon = Weapon("Sword", damageInflicted = 20)
    louise.weapon = tim.weapon
    tim.weapon = Weapon("Spear", damageInflicted = 15)

    eoghan.weapon = axe

    val redPotion = Loot("RedPotion", LootType.POTION, 7.50)
    tim.getLoot(redPotion)
    val chestArmour = Loot( "+3 Chest Armour", LootType.ARMOUR, 80.00)
    tim.getLoot(chestArmour)

    tim.showInventory()

    tim.getLoot(Loot("Ring of protection +2", LootType.RING, 40.25))

    tim.getLoot(Loot("Invisibility", LootType.POTION, 35.95))
    tim.showInventory()

    if(tim.dropLoot(redPotion)){
        tim.showInventory()
    }else{
        println("you dont have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)

    if(tim.dropLoot(bluePotion)){
        tim.showInventory()
    }else{
        println("You dont have ${bluePotion.name}")
    }

     tim.dropLoot("Invisibility Potion")

    tim.showInventory()

}
