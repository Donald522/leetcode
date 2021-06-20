package leetcode.task

import spock.lang.Specification
import spock.lang.Unroll

class Task_62Spec extends Specification {

    def task

    def setup() {
        task = new Task_62()
    }

    @Unroll
    def "test task 62"() {
        when:
        def res = task.uniquePaths(m, n)

        then:
        res == expected

        where:
        m  | n  || expected
        3  | 7  || 28
        3  | 2  || 3
        7  | 3  || 28
        3  | 3  || 6
        13 | 23 || 548354040
    }

}
