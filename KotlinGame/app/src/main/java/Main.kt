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
    tim.inventory.add(redPotion)
    tim.showInventory()

}
