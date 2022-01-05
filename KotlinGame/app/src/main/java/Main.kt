fun main(args: Array<String>) {
    val enemy = Enemy("test_enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("UglyTroll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampireKing("Dracula")
    println(dracula)

    while (dracula.lives > 0) {
        if (dracula.dodges()){
            continue
        }

        if (dracula.runAway()){
            println("Dracula ran away")
            break
        }else{
            dracula.takeDamage(12)
        }
    }
}