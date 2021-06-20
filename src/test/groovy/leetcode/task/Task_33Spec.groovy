package leetcode.task

import spock.lang.Specification

class Task_33Spec extends Specification {

    def task

    def setup() {
        task = new Task_33()
    }

    def "test task 33"() {
        when:
        def res = task.search(arr as int[], target)

        then:
        res == expected

        where:
        arr                   | target | expected
        [4, 5, 6, 7, 0, 1, 2] | 0      | 4
        [4, 5, 6, 7, 0, 1, 2] | 3      | -1
        [1]                   | 0      | -1
    }

}
