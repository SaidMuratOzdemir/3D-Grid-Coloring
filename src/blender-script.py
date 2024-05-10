import bpy
import csv
def func():
    bpy.ops.object.select_all(action='DESELECT')
    bpy.ops.object.select_by_type(type='MESH')
    bpy.ops.object.delete()
    with open('/Users/murat/IdeaProjects/discrete-project/graph_data.txt', 'r') as f:
        reader = csv.reader(f)
        for row in reader:
            depth, height, width, color, value = row
            bpy.ops.mesh.primitive_cube_add(size=1, location=(int(depth), int(height), int(width)))
            mat = bpy.data.materials.new(name="mat")
            mat.diffuse_color = (float(color), float(color), float(color), 1)
            bpy.context.object.data.materials.append(mat)

