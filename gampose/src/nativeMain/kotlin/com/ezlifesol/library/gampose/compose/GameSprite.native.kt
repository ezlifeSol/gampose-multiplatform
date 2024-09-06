package com.ezlifesol.library.gampose.compose

import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import com.ezlifesol.library.gampose.collision.OnCollidingListener
import com.ezlifesol.library.gampose.collision.collider.Collider
import com.ezlifesol.library.gampose.collision.shape.Shape
import com.ezlifesol.library.gampose.input.OnDraggingListener
import com.ezlifesol.library.gampose.unit.GameAnchor
import com.ezlifesol.library.gampose.unit.GameScale
import com.ezlifesol.library.gampose.unit.GameSize
import com.ezlifesol.library.gampose.unit.GameVector

actual fun GameSprite(
    assetPath: String,
    size: GameSize,
    modifier: Modifier,
    position: GameVector,
    anchor: GameAnchor,
    scale: GameScale,
    angle: Float,
    color: Color,
    collider: Collider<out Shape>?,
    otherColliders: Array<Collider<out Shape>>?,
    onColliding: OnCollidingListener?,
    onClick: (() -> Unit)?,
    onTap: ((Offset) -> Unit)?,
    onDoubleTap: ((Offset) -> Unit)?,
    onLongPress: ((Offset) -> Unit)?,
    onPress: ((Offset) -> Unit)?,
    onDragging: OnDraggingListener?
) {
}