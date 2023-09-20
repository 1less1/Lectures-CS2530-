## Overview
I want a program where I can instantiate an instance of a
number guessing game and then feed it guesses until I have
guessed the correct number. For now, let's make it with user
input.

When you initialize a number guessing game object, you specify
the maximum value for the number to guess. The object will then
allow you to make guesses and it will track the number of guesses
made. When you make a guess, the game somehow indicates if your
guess was higher or lower than the actual number.

**Aside**
A class is like a recipe for state and behavior for an object.
A class by itself doesn't do much (yet), but I can create
an _instance_ of a class by _instantiating_ it (calling 'new'
and then the constructor).