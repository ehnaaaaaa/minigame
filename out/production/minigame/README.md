# Minigame

## Описание

Проект представляет собой простую игру по угадыванию случайного числа.

Функция generateNumber(), которая создает число, которое нужно угадать.

В главной функции main() "запускается" сама игра, запрашивается число от пользователя и если оно совпадает с загаданным
числом, то выводится в консоль "You win!".

Так же число, введеное пользователем проходит ряд проверок:

- Если число находится не в диапозоне 1 - 10 программа сообщает, что наше число не подходит
- Если введеное значение не является числом, нам также сообщается ошибка
- Если число не равняется загадоному в консоли появляется текст "Wrong!"

## Начало работы
Необходимо синхронизировать локальный проект с удаленным репозиторием.

Использовалась команда

```
git clone https://gitlab.com/iict1/guess-number-game.git
```

Когда мы создали каталог на локальной системе и инициализируем его, мы создаем удаленый репозиторий

```
git init 
```

## Создание веток
Для того чтобы создать ветку необходимо в терминал написать следующую команду


```
git branch <название_ветки>
```

## Создание коммитов

Для того чтобы создать коммит мы воспользуемся следующей командой

```
git commit -m <комментарий>
git commit -a -m <комментарий>
```

Для того чтобы отправить наши изменения в репозиторий воспользуемся следующей командой

```
git push
```

## Работа с ветками

При работе с ветками используются следующие команды

```
git branch
git checkout <название_ветки>
git merge <название_ветки>
```