package com.sahilpvns.kotlinProgram.stringProgram



// Reverse Linked List
fun main() {

    val head = Node(1, Node(2, Node(3, Node(4))))

    println("Original Linked List:")
    printLinkedList(head)

    val reversedHead = reverseLinkedList(head)

    println("\nReversed Linked List:")
    printLinkedList(reversedHead)
}

data class Node(val value: Int, var next: Node? = null)

fun reverseLinkedList(head: Node?): Node? {
    var prev: Node? = null
    var current = head
    var next: Node?

    while (current != null) {
        next = current.next    // Store the next node
        current.next = prev    // Reverse the current node's pointer
        prev = current         // Move `prev` to this node
        current = next         // Move to the next node
    }

    return prev
}

fun printLinkedList(head: Node?) {
    var current = head
    while (current != null) {
        print("${current.value} -> ")
        current = current.next
    }
    println()

}
