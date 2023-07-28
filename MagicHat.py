import random

class MagicHat:
    def __init__(self):
        self.items = []

    def put(self, item):
        self.items.append(item)
        print(f"🎩 You put {item} into the magic hat.")
   
    def pick(self):
        if self.items:
            item = random.choice(self.items)
            self.items.remove(item)
            print(f"🎩 You picked {item} from the magic hat.")
            return item
        else:
            print("🎩 The magic hat is empty! Nothing to pick.")
            return None

    def show_items(self):
        print("🎩 The magic hat contains:", ', '.join(self.items) or "nothing")

# Let's play with the MagicHat class
if __name__ == "__main__":
    hat = MagicHat()

    hat.put("a rabbit")
    hat.put("a bunch of flowers")
    hat.put("a deck of cards")

    hat.show_items()

    hat.pick()
    hat.pick()
    hat.pick()
    hat.pick() 