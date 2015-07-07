package demo

class PrinterJob {
    static triggers = {
      simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {
        println 'PrinterJob Running'
    }
}
