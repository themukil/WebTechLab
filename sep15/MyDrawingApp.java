import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

class MyShape implements Serializable {
    private int x1, y1, x2, y2;
    private Color color;

    public MyShape(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }
}

class Drawing extends JPanel {
    private List<MyShape> shapes = new ArrayList<>();
    private MyShape currentShape;
    private Color currentColor = Color.BLACK;

    public Drawing() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                currentShape = new MyShape(x, y, x, y, currentColor);
                shapes.add(currentShape);
                repaint();
            }

            public void mouseReleased(MouseEvent e) {
                currentShape = null;
            }
        });

        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                if (currentShape != null) {
                    int x = e.getX();
                    int y = e.getY();
                    currentShape = new MyShape(currentShape.getX1(), currentShape.getY1(), x, y, currentColor);
                    shapes.set(shapes.size() - 1, currentShape);
                    repaint();
                }
            }
        });
    }

    public void setColor(Color color) {
        currentColor = color;
    }

    public void clearCanvas() {
        shapes.clear();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MyShape shape : shapes) {
            g.setColor(shape.getColor());
            g.drawLine(shape.getX1(), shape.getY1(), shape.getX2(), shape.getY2());
        }
    }

    public void saveDrawing(String filename) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(shapes);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while saving the drawing: " + e.getMessage());
        }
    }

    public void loadDrawing(String filename) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            shapes = (List<MyShape>) inputStream.readObject();
            repaint();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File not found: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error while reading the file: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error loading class: " + e.getMessage());
        }
    }
}

public class MyDrawingApp extends JFrame {
    private Drawing drawingPanel;

    public MyDrawingApp() {
        setTitle("My Drawing Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new Drawing();
        add(drawingPanel, BorderLayout.CENTER);

        JToolBar toolbar = new JToolBar();
        JButton loadButton = new JButton("Load");
        JButton saveButton = new JButton("Save");
        JButton clearButton = new JButton("Clear");
        JComboBox<String> colorComboBox = new JComboBox<>(new String[]{"Black", "Red", "Green", "Blue"});

        loadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    drawingPanel.loadDrawing(selectedFile.getAbsolutePath());
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showSaveDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    drawingPanel.saveDrawing(selectedFile.getAbsolutePath());
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                drawingPanel.clearCanvas();
            }
        });

        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                switch (selectedColor) {
                    case "Black":
                        drawingPanel.setColor(Color.BLACK);
                        break;
                    case "Red":
                        drawingPanel.setColor(Color.RED);
                        break;
                    case "Green":
                        drawingPanel.setColor(Color.GREEN);
                        break;
                    case "Blue":
                        drawingPanel.setColor(Color.BLUE);
                        break;
                }
            }
        });

        toolbar.add(loadButton);
        toolbar.add(saveButton);
        toolbar.add(clearButton);
        toolbar.add(colorComboBox);
        add(toolbar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MyDrawingApp app = new MyDrawingApp();
                app.setVisible(true);
            }
        });
    }
}

