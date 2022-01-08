    root = s.pop();

            } else if (list[i] == -1) {
                Node t = s.pop();
                Node p = s.peek();
                p.children.add(t);