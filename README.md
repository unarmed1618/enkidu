# enkidu
A crazy unicode text-graphical 2d top down adventure game idea I had randomly.
## Concept:
So, there's a shitload of characters in unicode. I want to make an adventure game that has the potential for limitless expansion, and relies on unicode characters entirely for graphics.

## Offline element:
A world with some worldgen code to keep things building and growing as you explore it. I'll probably rip off some minecraft logic. Monsters, terrain, trees, etc.

## Online element: 
Basically, track the location of entities and their states and interactions via servers, but interface with other players' "Worlds" by keeping actual world-code quite simple and small. This should eventually permit multicasting and peer to peer multiplayer. All worlds will exist within the world, at different x,y locations that can be traversed to based on your position, your avatar, and your character.

## Avatars:
As there are 65535 unicode characters, it is my intention to make every actual player use a unique avatar for online play that is a specific unicode character. That character will be their avatar forever. 
This will aid in the tracking and use of entities, land ownership, and magic.

## Magic:
It is my intention to give players the ability to interact with the world around them via editing, magic, programming, etc.
All sorts of ways.
Based on unicode control characters and other shit like that, but with limits on how much it can affect other players, map elements, and etc.
