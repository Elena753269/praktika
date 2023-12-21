package testproject;

/** Class that aggregates a lot of values into one summ */
class Aggregator {
    private double sum = 0;

    /**
     * Add a value to the aggregated number.
     * @param value number to add to the sum
     */
    void addValue(double value) {
        sum += value;
    }

    /**
     * Get the sum of all valued added so far.
     * @return sum.
     */
    double getSum() {
        return sum;
    }

    /**
     * Reset the aggregated value
     */
    void reset() {
        sum = 0;
    }
}
/*
Часть 1
Cоздать общий репазиторий в github
 
Засунуть файл с test-project

в cmd:
копировать репозиторий: 
cd "путь к папке" 
git clone "URL github"

создать .gitignore 

# Игнорировать временные файлы с суффиксом ~
*~

# Игнорировать служебные файлы Gradle в каталоге .gradle
.gradle/

# Игнорировать файлы сборки в каталоге build
build/

в cmd:
cd "путь до gitignore"
git config --global user.email "почта github"
git config --global user.name "имя github"
git add .gitignore
git commit -m "Добавлен .gitignore для игнорирования временных файлов, .gradle и build"
git push origin main

Часть 3
1)Source Code Management - Git - Repository URL(вставить URL github)
Build Steps - Invoke Gradle script - Use Gradle Wrapper - Make gradlew executable
2)Branches to build - Branch Specifier - */main

сохранить и запустить

Build Steps - Execute shell

cd /home/user/.jenkins/workspace/esmorodnikova-job1
./gradlew build test

сохранить и запустить

Post-build Actions - Publish JUnit test result report - Test report XMLs - build/test-results/test/*.xml

сохранить и запустить

Часть 4

Внесите ошибку в исходные коды проекта (не в тесты!), которая не препятствует компиляции, но вызовет неправильное поведение

Зафиксируйте изменения и отправьте их в удаленный репозиторий:

git add .
git commit -m "Introduce a bug for testing"
git push origin main

Запустите сборку проекта в Jenkins. Убедитесь, что она завершается неудачей из-за ошибок в тестах.

Запишите номер неудачной сборки, который содержит результаты выполнения задания.

Отмените изменения в репозитории с помощью системы управления версиями:

git log
git revert <commit-hash> -m 1
git add .
git commit -m "Introduce a bug for testing"
git push origin main

Запишите команду отмены изменений в репозитории.

Отправьте изменения в удаленный репозиторий.

Запустите сборку проекта в Jenkins и убедитесь, что она выполняется без ошибок.

Запишите номер успешной сборки после отмены изменений.


Часть 5
Подключите плагин JaCoCo к вашему Gradle-проекту. Обновите файл build.gradle:

plugins {
    id 'java'
    id 'jacoco'
}

jacoco {
    toolVersion = "0.8.7"
}

test {
    useJUnitPlatform()
    finalizedBy jacocoTestReport
}

git add .
git commit -m "Add JaCoCo plugin for code coverage"
git push origin main

Запустите сборку проекта в Jenkins и убедитесь, что она выполняется без ошибок.
Запишите номер успешной сборки с включенным JaCoCo.

*/
