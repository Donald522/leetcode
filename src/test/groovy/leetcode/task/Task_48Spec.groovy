package leetcode.task

import spock.lang.Specification

class Task_48Spec extends Specification {

    def task

    def setup() {
        task = new Task_48()
    }

    def "test matrix 1x1"() {
        given:
        def matrix = [[1]] as int[][]

        when:
        task.rotate(matrix)

        then:
        matrix == [[1]] as int[][]
    }

    def "test matrix 3x3"() {
        given:
        def matrix = [[1,2,3],[4,5,6],[7,8,9]] as int[][]

        when:
        task.rotate(matrix)

        then:
        matrix == [[7,4,1],[8,5,2],[9,6,3]] as int[][]
    }

    def "test matrix 4x4"() {
        given:
        def matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]] as int[][]

        when:
        task.rotate(matrix)

        then:
        matrix == [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]] as int[][]
    }
}
